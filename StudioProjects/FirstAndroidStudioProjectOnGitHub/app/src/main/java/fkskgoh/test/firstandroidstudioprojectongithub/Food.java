package fkskgoh.test.firstandroidstudioprojectongithub;

/**
 * Created by florian on 15.06.16.
 */
public class Food {
    String name;        //"Schnitzel"
    double price;        //1.98
    int times_eaten;    //4     N e [0,n)
    double rating;       //3.75  [0.5, 5] | -1=Fehler -2=noch nie berechnet

    public Food()
    {
        name=null;
        price=0;
        times_eaten=0;
        rating=0.5;
    }

    public Food(String i_name,double i_price, int i_times_eaten, double i_rating)   //Um aus gespeicherten Daten die Objekte zu erzeugen!
    {
        this.name = i_name;
        this.price = i_price;
        this.times_eaten = i_times_eaten;
        this.rating = i_rating;
    }

    public Food(String i_name, double i_price){
        this.rating=-2;
        this.name=i_name;
        this.price=i_price;
        this.times_eaten=0;
    }

    public double getPrice()
    {
        return price;
    }

    public double getRating()
    {
        return rating;
    }
}
