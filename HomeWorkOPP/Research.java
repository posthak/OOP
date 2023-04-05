package HomeWorkOPP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Research implements InOutable {

    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

    @Override
    public void fileUpload() {
        try (// TODO Auto-generated method stub
                FileWriter writer = new FileWriter("person.txt")) {
            for (Node t : tree) {
                if (t.getRe() == Relationship.parent)
                    writer.write(
                            t.getP1().getFullName() + " и " + t.getP2().getFullName() + " - " + Relationship.parent
                                    + " "
                                    + System.getProperty("line.separator") + "\n");
                else {
                    writer.write(t.getP2().getFullName() + " - " + Relationship.children + " "
                            + System.getProperty("line.separator") + "\n");
                }
            }
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    @Override
    public void fileDownload() {
        // TODO Auto-generated method stub
        ArrayList<String> res = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("person.txt")))) {
            while (true) {
                String s = reader.readLine();
                if (s == null)
                    break;
                res.add(s);
                System.out.println(s);
            }
            reader.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public Research(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> byPerson(Person p) {
        for (Node t : tree) {
            if (t.getP1().getFullName() == p.getFullName() || t.getP2().getFullName() == p.getFullName()) {
                if (t.getRe() == Relationship.parent) {
                    result.add(t.getP1().getFullName() + " and  " + t.getP2().getFullName() + " " + "Parents");
                } else {
                    result.add(t.getP2().getFullName() + " Child");
                }
            }
        }
        return result;
    }

    public ArrayList<String> allTree() {
        for (Node t : tree) {
            if (t.getRe() == Relationship.parent) {
                result.add(
                        t.getP1().getFullName() + " (Age: " + t.getP1().getAge() + " Gender: " + t.getP1().getGender()
                                + ") and  " + t.getP2().getFullName()
                                + " (Age: " + t.getP2().getAge() + ", Gender: " + t.getP2().getGender()
                                + ") - Parents\n");
            } else {
                result.add(t.getP2().getFullName() + " (Age: " + t.getP2().getAge() + ", Gender: "
                        + t.getP2().getGender() + ")" + " - Child \n");

            }
        }

        return result;
    }

}