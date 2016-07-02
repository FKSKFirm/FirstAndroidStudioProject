package fkskgoh.test.firstandroidstudioprojectongithub;



import java.util.Vector;

/**
 * Created by florian on 15.06.16.
 */
public class CalculationCore {
    private Vector<Food> foodList;

    public CalculationCore(Vector<Food> in)
    {
        foodList=in;
    }

    public int loadFromFile()           //0=erfolg 1=dokument ex nicht 2=lesen fehgeschlagen
    {
        // TODO: 15.06.16  lesen aus Datei, umwandeln in Objekte und an Vecktor haengen
        //ZU TESTZWECKEN
        foodList.add(new Food("Kängururagout in Cocos-Chili-Sosse", 2.68));
        foodList.add(new Food("Schweineschnitzel 'Wiener Art' mit Zitrone", 1.98));
        foodList.add(new Food("Käsespätzle mit Röstzwiebeln", 1.98));
        return 0;
    }

    public Food findCheapest()
    {
        Food result = new Food("FakeFood", 99.99, 0,0);
        for(int i = 0; i<foodList.size(); i++)
        {
            if(result.getPrice()> foodList.elementAt(i).getPrice())
                result=foodList.elementAt(i);
        }
        return result;
    }

    public Vector<Food> sortAfterRating(CalculationCore helpCore)
    {
        Vector<Food> result = new Vector<Food>(helpCore.foodList.size());

        for(int i = helpCore.foodList.size(); i >0 ; i--) {
            Food f = helpCore.findBestRating();
            result.add(f);
            helpCore.foodList.removeElement(f);
        }
        return result;
    }

    public Food findBestRating()
    {
        Food result = new Food("FakeFood", 99.99, 0,0);
        for(int i = 0; i<foodList.size(); i++)
        {
            if(result.getRating()> foodList.elementAt(i).getRating())
                result=foodList.elementAt(i);
        }
        return result;
    }

    public String saveData()   //0=erfolgreich 1=Error
    {
        try{

        }catch (Exception e)
        {
            return e.toString();
        }

        return "Speichern erfolgreich";
    }
}
