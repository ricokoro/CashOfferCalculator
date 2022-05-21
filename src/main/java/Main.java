import Model.Property;
import Model.SingleFamilyHome;

import java.text.DecimalFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Input values
        String address;
        int numBedrooms;
        double numBathrooms;
        int livingAreaSize;
        boolean newFloors;
        boolean newPaint;
        boolean newKitchen;
        boolean newBathrooms;
        boolean newRoof;
        boolean newHVAC;
        int foundationIssues;
        int answerChoice;
        int ARV;
        Scanner scanner = new Scanner(System.in);

        //Property Characteristics Input
        System.out.println("Enter property address: ");
        address = scanner.nextLine();
        System.out.println("Enter number of bedrooms: ");
        numBedrooms = scanner.nextInt();
        System.out.println("Enter number of bathrooms: ");
        numBathrooms = scanner.nextDouble();
        System.out.println("Enter living area: ");
        livingAreaSize = scanner.nextInt();
        System.out.println("Enter your estimated property ARV: ");
        ARV = scanner.nextInt();

        //Repair Evaluation
        System.out.println("Does your property need new flooring? (Enter 1 for yes and 0 for no)");
        answerChoice = scanner.nextInt();
        newFloors = switch (answerChoice) {
            case 0 -> false;
            case 1 -> true;
            default -> throw new IllegalArgumentException("Answer choice must either be 0 or 1)");
        };
        System.out.println("Does your property need new paint? (Enter 1 for yes and 0 for no)");
        answerChoice = scanner.nextInt();
        newPaint = switch (answerChoice) {
            case 0 -> false;
            case 1 -> true;
            default -> throw new IllegalArgumentException("Answer choice must either be 0 or 1)");
        };
        System.out.println("Does your property need an updated kitchen? (Enter 1 for yes and 0 for no)");
        answerChoice = scanner.nextInt();
        newKitchen = switch (answerChoice) {
            case 0 -> false;
            case 1 -> true;
            default -> throw new IllegalArgumentException("Answer choice must either be 0 or 1)");
        };
        System.out.println("Does your property need updated bathrooms? (Enter 1 for yes and 0 for no)");
        answerChoice = scanner.nextInt();
        newBathrooms = switch (answerChoice) {
            case 0 -> false;
            case 1 -> true;
            default -> throw new IllegalArgumentException("Answer choice must either be 0 or 1)");
        };
        System.out.println("Does your property need a new roof? (Enter 1 for yes and 0 for no)");
        answerChoice = scanner.nextInt();
        newRoof = switch (answerChoice) {
            case 0 -> false;
            case 1 -> true;
            default -> throw new IllegalArgumentException("Answer choice must either be 0 or 1)");
        };
        System.out.println("Does your property need a new HVAC system? (Enter 1 for yes and 0 for no)");
        answerChoice = scanner.nextInt();
        newHVAC = switch (answerChoice) {
            case 0 -> false;
            case 1 -> true;
            default -> throw new IllegalArgumentException("Answer choice must either be 0 or 1)");
        };
        System.out.println("Does your property have foundational issues? (Enter 1 for yes and 0 for no)");
        answerChoice = scanner.nextInt();
        if(answerChoice == 0){
            foundationIssues = 0;
        }
        else{
            System.out.println("Are the foundation repairs needed major or minor? (Enter 1 for major and 0 for minor)");
            answerChoice = scanner.nextInt();
            foundationIssues = switch (answerChoice) {
                case 0 -> 1;
                case 1 -> 2;
                default -> throw new IllegalArgumentException("Answer choice must either be 0 or 1)");
            };
        }

        //Creates new property object and outputs cash offer to console
        Property property = new SingleFamilyHome(address, numBedrooms, numBathrooms, livingAreaSize, newFloors,
                newPaint, newKitchen, newBathrooms, newRoof, newHVAC, foundationIssues, ARV);
        System.out.println("Northstate Equity's Cash Offer: ");
        System.out.println(new DecimalFormat("$#,##0.00").format(property.getOffer()));

    }
}
