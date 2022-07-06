package Model;

import java.util.ArrayList;

public interface Property {

    /** Returns true if the property is a single family home */
    boolean isSFH();

    /** Returns true if the property is a multifamily home */
    boolean isMFH();

    /** Returns true if the property is land */
    boolean isLand();

    /** Returns property address */
    String getAddress();

    /** Returns number of bedrooms in property */
    int getNumBedrooms();

    /** Returns number of bathrooms in property */
    double getNumBathrooms();

    /** Returns living area square footage in property */
    int getLivingAreaSize();

    /** Returns cash offer */
    double getOffer();

    /** Returns cash offer range*/
    double[] getOfferRange();

    /** Returns ARV */
    int getARV();

    /** Returns true if property needs new flooring */
    boolean needsNewFlooring();

    /** Returns true if property needs new paint */
    boolean needsNewPaint();

    /** Returns true if property needs new kitchen */
    boolean needsNewKitchen();

    /** Returns true if property needs new bathrooms */
    boolean needsNewBathrooms();

    /** Returns true if property needs new roof */
    boolean needsNewRoof();

    /** Returns true if property needs new HVAC */
    boolean needsNewHVAC();

    /** Returns 0 if there are no foundation issues, 1 if foundation issues are minor, 2 if foundation issues are major */
    int foundationIssues();

    enum RoofCondition {
        NEEDS_REPLACING,
        AVERAGE,
        GREAT
    }

    enum Condition {
        NEEDS_WORK,
        AVERAGE,
        GREAT
    }




}
