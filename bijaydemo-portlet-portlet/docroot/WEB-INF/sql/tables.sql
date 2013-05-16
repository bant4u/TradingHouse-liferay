create table BJ_THAdmin (
	id_ LONG not null primary key,
	companyId LONG,
	name VARCHAR(75) null,
	password_ VARCHAR(75) null,
	groupId LONG
);