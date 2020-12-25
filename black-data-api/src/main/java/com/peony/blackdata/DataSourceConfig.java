package com.peony.blackdata;

public class DataSourceConfig {

    private DataSourceType dataSourceType;

    private DelegateDataSource delegateDataSource;

    private String dataSourceKey;

    public DataSourceConfig(DataSourceType dataSourceType, DelegateDataSource delegateDataSource, String dataSourceKey) {
        this.dataSourceType = dataSourceType;
        this.delegateDataSource = delegateDataSource;
        this.dataSourceKey = dataSourceKey;
    }


    public DataSourceType getDataSourceType() {
        return dataSourceType;
    }

    public DelegateDataSource getDelegateDataSource() {
        return delegateDataSource;
    }

    public String getDataSourceKey() {
        return dataSourceKey;
    }
}
