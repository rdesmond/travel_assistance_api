package com.models;

/** Enum that contains possible tags for trips and destinations. This should match the boolean values in the
 * destinations table in the DB.
 *
 * @author cass
 */
public enum TripTag {

    VALUE, BEACH, CULTURE, FOOD, LUXURY, MOUNTAIN, TROPICAL, DESERT, ADVENTURE, ROMANCE, RELAXATION, NATURE, SPORTS;

    //Confirm that a given string is a valid tag
    public int matchingTag(String givenTag){
        for (TripTag value : TripTag.values()){
            if (givenTag.equals(value.toString())){
                return 1;
            }
        }
        return 0;
    }
}
