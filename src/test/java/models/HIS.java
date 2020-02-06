package models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HIS {

    String AssessmentDate;
    String DateAssessorSigned;
    String Status;
    String AssessmentType;
    String DwellingType;
    String AccessibilityConcerns;
    String FamilyLivingOn;
    String NumberOfBedrooms;
    String InternetInHome;
    String StairsRequiredToConsumerBedroom;
    String WifiInHome;
    String NumberOfBathrooms;
    String ComputerTabletInHome;
    String StairsRequiredToConsumerBathroom;
    String CaregiverSmartPhone;
    String CaregiverSmartPhoneBrand;
    String CaregiverTechnologyProficiency;
    String HomeOwnershipCurrentStatus;
    String HomeStability;
    String LifeEssentials;
    String EnergyAssistance;
    String FoodAssistance;
    String ReferralForEnergyAssistance;
    String ReferralForFoodAssistance;
    String PetsInHome;
    String SmokersInTheHome;
    String ProblemsWithPets;
    String OverallSafetyConcerns;
    String DoesConsumerFeelSafe;
    String DoesCaregiverFeelSafe;
}
