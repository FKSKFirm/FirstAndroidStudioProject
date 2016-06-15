package fkskgoh.test.firstandroidstudioprojectongithub;

import android.content.Context;
import android.widget.Toast;

import java.util.Vector;

/**
 * Created by florian on 15.06.16.
 */
public class CalculationCore {
    static Vector<Food> foodList;

    static int loadFromFile()           //0=erfolg 1=dokument ex nicht 2=lesen fehgeschlagen
    {
        // TODO: 15.06.16  lesen aus Datei, umwandeln in Objekte und an Vecktor haengen
        //ZU TESTZWECKEN
        foodList.add(new Food("Kängururagout in Cocos-Chili-Sosse", 2.68));
        foodList.add(new Food("Schweineschnitzel 'Wiener Art' mit Zitrone", 1.98));
        foodList.add(new Food("Käsespätzle mit Röstzwiebeln", 1.98));
        return 0;
    }

    static Food findCheapest()
    {
        Food result = new Food("FakeFood", 99.99, 0,0);
        for(int i = 0; i<foodList.size(); i++)
        {
            if(result.getPrice()> foodList.elementAt(i).getPrice())
                result=foodList.elementAt(i);
        }
        return result;
    }

    static Food findBestRating()
    {
        Food result = new Food("FakeFood", 99.99, 0,0);
        for(int i = 0; i<foodList.size(); i++)
        {
            if(result.getRating()> foodList.elementAt(i).getRating())
                result=foodList.elementAt(i);
        }
        return result;
    }

    static String saveData()   //0=erfolgreich 1=Error
    {
        try{

        }catch (Exception e)
        {
            return e.toString();
        }

        return "Speichern erfolgreich";
    }
}
