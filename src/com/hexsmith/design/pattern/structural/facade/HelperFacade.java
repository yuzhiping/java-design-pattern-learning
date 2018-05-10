/**
 * Copyright (C) 2016-2018 The hexsmith Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
     http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
package com.hexsmith.design.pattern.structural.facade;

import java.sql.Connection;

/**
 * @Description
 * @author hexsmith
 * @date 2018年5月10日 下午7:48:07
 * @version v1.0
 */
public class HelperFacade {

    public static void generateReport(DBTypes dbType, ReportTypes reportType, String tableName) {
        Connection con = null;
        switch (dbType) {
        case MYSQL:
            con = MySqlHelper.getMySqlDBConnection();
            MySqlHelper mySqlHelper = new MySqlHelper();
            switch (reportType) {
            case HTML:
                mySqlHelper.generateMySqlHTMLReport(tableName, con);
                break;
            case PDF:
                mySqlHelper.generateMySqlPDFReport(tableName, con);
                break;
            }
            break;
        case ORACLE:
            con = OracleHelper.getOracleDBConnection();
            OracleHelper oracleHelper = new OracleHelper();
            switch (reportType) {
            case HTML:
                oracleHelper.generateOracleHTMLReport(tableName, con);
                break;
            case PDF:
                oracleHelper.generateOraclePDFReport(tableName, con);
                break;
            }
            break;
        }
    }

    static enum DBTypes {
        MYSQL, ORACLE;
    }

    static enum ReportTypes {
        HTML, PDF;
    }

}
