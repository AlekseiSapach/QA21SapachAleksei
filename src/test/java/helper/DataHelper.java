package helper;

import models.UserCardBuild;
import models.UserCard;
import utils.configuration.ReadProperties;

public class DataHelper {

    public static UserCard getUserCard(){
        UserCard userCard = new UserCard();
        userCard.setFirstName(ReadProperties.firstname());
        userCard.setLastName(ReadProperties.lastname());
        userCard.setZipCode(ReadProperties.zipCode());
        return userCard;
    }

    public static UserCardBuild getUserCardBuild() {
        UserCardBuild userCardBuild = new UserCardBuild.Builder()
                .withFirstName("Sapach")
                .withLastName("Aleksei")
                .withZipCode("1992")
                .build();
        return userCardBuild;
    }
}
