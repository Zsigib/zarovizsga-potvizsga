package hu.nive.ujratervezes.zarovizsga.peoplesql;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;

public class PeopleDao {

    private DataSource dataSource;

    public PeopleDao(MariaDbDataSource dataSource) {
            this.dataSource=dataSource

    }

    public String findIpByName(String brina, String snibson) {
    }
}
