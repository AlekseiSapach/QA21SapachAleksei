package helper;

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

        logger.info(userCard.toString());
        return userCard;
    }
}
