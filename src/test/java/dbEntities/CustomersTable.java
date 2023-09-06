package dbEntities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import services.DataBaseService;
import tests.dbTest.sqlTest;

public class CustomersTable {
    static Logger logger = LogManager.getLogger(CustomersTable.class);

    DataBaseService dataBaseService;

    public CustomersTable(DataBaseService dataBaseService){
        this.dataBaseService = dataBaseService;
    }
    public void dropTable(){
        logger.info("Удаление таблицы");
        String dropTableCustomersSQL = "DROP TABLE Customers;";
        dataBaseService.executeSQL(dropTableCustomersSQL);
    }
    public void createTable(){
        logger.info("Создание таблицы");
        String createTableSQL = "-- запрос sql";
        dataBaseService.executeSQL(createTableSQL);
    }

}
