package helper;

import models.User;
import models.UserCardBuild;
import models.UserCard;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utils.configuration.ReadProperties;

public class DataHelper {
    static Logger logger = LogManager.getLogger(DataHelper.class);

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
    public static User getAdminUser() {
        User user = new User();
        user.setEmail(ReadProperties.username());
        user.setPassword(ReadProperties.password());

        logger.info(user.toString());
        return user;
    }

    public static User getStandartUser() {
        User user = new User();
        user.setEmail(ReadProperties.username());
        user.setPassword(ReadProperties.password());

        logger.info(user.toString());
        return user;
    }
}
