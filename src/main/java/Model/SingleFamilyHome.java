package Model;
import java.util.*;

public class SingleFamilyHome implements Property{
    //Fields
    private final String address;
    private final int numBedrooms;
    private final double numBathrooms;
    private final int livingAreaSize;
    private final boolean newFloors;
    private final boolean newPaint;
    private final boolean newKitchen;
    private final boolean newBathrooms;
    private final boolean newRoof;
    private final boolean newHVAC;
    private final int foundationIssues;
    private final int ARV;


    //Constructors
    public SingleFamilyHome(String address, int numBedrooms, double numBathrooms, int livingAreaSize,
                            boolean newFloors, boolean newPaint, boolean newKitchen, boolean newBathrooms,
                            boolean newRoof, boolean newHVAC, int foundationIssues, int ARV){
        //Parameter Validation
        if(numBedrooms < 1)
            throw new IllegalArgumentException("Number of bedrooms must be positive");
        if(numBathrooms < 0.5)
            throw new IllegalArgumentException("Number of bathrooms must be positive");
        if(livingAreaSize < 1)
            throw new IllegalArgumentException("Living area size must be positive");
        if(ARV < 1)
            throw new IllegalArgumentException("ARV must be greater than 0");
        if((foundationIssues < 0) || (foundationIssues > 2))
            throw new IllegalArgumentException("Foundation issues value must be between 0 and 2");

        this.address = address;
        this.numBedrooms = numBedrooms;
        this.numBathrooms = numBathrooms;
        this.livingAreaSize = livingAreaSize;
        this.newFloors = newFloors;
        this.newPaint = newPaint;
        this.newKitchen = newKitchen;
        this.newBathrooms = newBathrooms;
        this.newRoof = newRoof;
        this.newHVAC = newHVAC;
        this.foundationIssues = foundationIssues;
        this.ARV = ARV;
    }

    //Methods
    @Override
    public boolean isSFH(){
        return true;
    }

    @Override
    public boolean isMFH(){
        return false;
    }

    @Override
    public boolean isLand(){
        return false;
    }

    @Override
    public String getAddress(){
        return address;
    }

    @Override
    public int getNumBedrooms(){
        return numBedrooms;
    }

    @Override
    public double getNumBathrooms(){
        return numBathrooms;
    }

    @Override
    public int getLivingAreaSize(){
        return livingAreaSize;
    }

    @Override
    public double getOffer(){
        double rehabBudget = 0;
        if(newFloors)
            rehabBudget += (4.75 * livingAreaSize);
        if(newPaint)
            rehabBudget += (2.75 * livingAreaSize);
        if(newKitchen)
            rehabBudget += 12000;
        if(newBathrooms)
            rehabBudget += (5000 * numBathrooms);
        if(newRoof)
            rehabBudget += 11000;
        if(newHVAC)
            rehabBudget += 6000;
        switch(foundationIssues){
            case 1:
                rehabBudget += 15000;
            case 2:
                rehabBudget += 50000;
        }

        return ((ARV * 0.75) - rehabBudget - 5000);
    }

    @Override
    public int getARV(){
        return ARV;
    }

    @Override
    public boolean needsNewFlooring(){
        return newFloors;
    }

    @Override
    public boolean needsNewPaint(){
        return newPaint;
    }

    @Override
    public boolean needsNewKitchen(){
        return newKitchen;
    }

    @Override
    public boolean needsNewBathrooms(){
        return newBathrooms;
    }

    @Override
    public boolean needsNewRoof(){
        return newRoof;
    }

    @Override
    public boolean needsNewHVAC(){
        return newHVAC;
    }

    @Override
    public int foundationIssues(){
        return foundationIssues;
    }

}
