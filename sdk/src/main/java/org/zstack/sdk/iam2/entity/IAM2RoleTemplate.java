package org.zstack.sdk.iam2.entity;

import org.zstack.sdk.PolicyStatement;

public class IAM2RoleTemplate  {

    public java.lang.String uuid;
    public void setUuid(java.lang.String uuid) {
        this.uuid = uuid;
    }
    public java.lang.String getUuid() {
        return this.uuid;
    }

    public java.lang.String name;
    public void setName(java.lang.String name) {
        this.name = name;
    }
    public java.lang.String getName() {
        return this.name;
    }

    public java.lang.String roleUuid;
    public void setRoleUuid(java.lang.String roleUuid) {
        this.roleUuid = roleUuid;
    }
    public java.lang.String getRoleUuid() {
        return this.roleUuid;
    }

    public java.sql.Timestamp createDate;
    public void setCreateDate(java.sql.Timestamp createDate) {
        this.createDate = createDate;
    }
    public java.sql.Timestamp getCreateDate() {
        return this.createDate;
    }

    public java.sql.Timestamp lastOpDate;
    public void setLastOpDate(java.sql.Timestamp lastOpDate) {
        this.lastOpDate = lastOpDate;
    }
    public java.sql.Timestamp getLastOpDate() {
        return this.lastOpDate;
    }

    public PolicyStatement statement;
    public void setStatement(PolicyStatement statement) {
        this.statement = statement;
    }
    public PolicyStatement getStatement() {
        return this.statement;
    }

}
