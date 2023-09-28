package ToyShop;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Shop {
    LinkedList<Toy> queueOfToys;

    public Shop() {
        this.queueOfToys = new LinkedList<>();
    }
    public  void lottery() {
        Random rnd = new Random();
        int rndNumber = rnd.nextInt(100);
        if (rndNumber < Ball.percentage){
            try {
                Ball.setQuantityInStock(Ball.getQuantityInStock()-1);
                queueOfToys.add(new Ball(Ball.getQuantityGiven() +1, "Ball"+ Ball.getQuantityGiven() +1));
                Ball.setQuantityGiven(Ball.getQuantityGiven()+1);
            } catch (ToyOutOfStockException e) {
                System.out.println("Balls " + e.getMessage());
            }
        }
        else if (rndNumber < Ball.percentage + TeddyBear.percentage){
            try {
                TeddyBear.setQuantityInStock(TeddyBear.getQuantityInStock()-1);
                queueOfToys.add(new TeddyBear(TeddyBear.getQuantityGiven() +1, "TeddyBear"+ TeddyBear.getQuantityGiven() +1));
                TeddyBear.setQuantityGiven(TeddyBear.getQuantityGiven()+1);
            } catch (ToyOutOfStockException e) {
                System.out.println("TeddyBears " + e.getMessage());
            }
        }
        else {
                try {
                    Car.setQuantityInStock(Car.getQuantityInStock()-1);
                    queueOfToys.add(new Car(Car.getQuantityGiven() +1, "Car"+ Car.getQuantityGiven() +1));
                    Car.setQuantityGiven(Car.getQuantityGiven()+1);
                } catch (ToyOutOfStockException e) {
                    System.out.println("Cars " + e.getMessage());
                }
        }
    }
    public void giveToyToWinner (String name){
        Toy toy =  queueOfToys.pollFirst();
            try(FileWriter writer = new FileWriter("notes.txt", true))
            {
                writer.write(toy.toString() + "is given to" +  name);
                writer.append('\n');
                writer.flush();
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }
    }
}
