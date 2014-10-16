package com.alibaba.datax.plugin.reader.sqlserverreader;

import com.alibaba.datax.common.spi.ErrorCode;

public enum SqlServerReaderErrorCode implements ErrorCode {
	RUNTIME_EXCEPTION("SqlServerReader-00", "run time exception"), CONF_ERROR(
			"SqlServerReader-00", "meet a configure error."), UNKNOWN_ERROR(
			"SqlServerReader-01", "todo"), NOT_RECOMMENDED(
			"SqlServerReader-02", "your config not recommended."), TABLE_QUERYSQL_MIXED(
			"SqlServerReader-03",
			"your config has both table and querySql, error."), CONN_DB_ERROR(
			"SqlServerReader-04", "can not connect to database server"), ;

	private String code;
	private String description;

	private SqlServerReaderErrorCode(String code, String description) {
		this.code = code;
		this.description = description;
	}

	@Override
	public String getCode() {
		return this.code;
	}

	@Override
	public String getDescription() {
		return this.description;
	}

}
