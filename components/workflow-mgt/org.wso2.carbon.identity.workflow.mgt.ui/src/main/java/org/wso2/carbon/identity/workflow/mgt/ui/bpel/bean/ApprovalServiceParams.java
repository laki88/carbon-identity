/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.workflow.mgt.ui.bpel.bean;

import org.apache.commons.lang.StringUtils;

public class ApprovalServiceParams {

    private String bpelProcessName;         //${bpelProcessName}

    private String htServiceName;           //${htServiceName}

    private String bpsHostName;             //${bpsHostName}

    private String carbonHostName;          //${carbonHostName}
    private String carbonAuthUser;              //${isUserName}
    private String carbonUserPassword;          //${carbonUserPassword}

    private String humanTaskSubject;        //${htSubject}
    private String humanTaskDescription;    //${htDescription}

    private String htPotentialOwnerRole;    //${htOwnerRole}
    private String htAdminRole;             //${htAdminRole}

    //for deployment
    private String bpsUsername;
    private String bpsUserPassword;

    public String getBpelProcessName() {
        return bpelProcessName;
    }

    public void setBpelProcessName(String bpelProcessName) {
        this.bpelProcessName = bpelProcessName;
    }

    public String getHtServiceName() {
        return htServiceName;
    }

    public void setHtServiceName(String htServiceName) {
        this.htServiceName = htServiceName;
    }

    public String getBpsHostName() {
        return bpsHostName;
    }

    public void setBpsHostName(String bpsHostName) {
        if (StringUtils.isNotBlank(bpsHostName) && bpsHostName.endsWith("/")) {
            bpsHostName = bpsHostName.substring(0, bpsHostName.length() - 1);
        }
        this.bpsHostName = bpsHostName;
    }

    public String getCarbonHostName() {
        return carbonHostName;
    }

    public void setCarbonHostName(String carbonHostName) {
        if (StringUtils.isNotBlank(carbonHostName) && carbonHostName.endsWith("/")) {
            carbonHostName = carbonHostName.substring(0, carbonHostName.length() - 1);
        }
        this.carbonHostName = carbonHostName;
    }

    public String getCarbonAuthUser() {
        return carbonAuthUser;
    }

    public void setCarbonAuthUser(String carbonAuthUser) {
        this.carbonAuthUser = carbonAuthUser;
    }

    public String getCarbonUserPassword() {
        return carbonUserPassword;
    }

    public void setCarbonUserPassword(String carbonUserPassword) {
        this.carbonUserPassword = carbonUserPassword;
    }

    public String getHumanTaskSubject() {
        return humanTaskSubject;
    }

    public void setHumanTaskSubject(String humanTaskSubject) {
        this.humanTaskSubject = humanTaskSubject;
    }

    public String getHumanTaskDescription() {
        return humanTaskDescription;
    }

    public void setHumanTaskDescription(String humanTaskDescription) {
        this.humanTaskDescription = humanTaskDescription;
    }

    public String getHtPotentialOwnerRole() {
        return htPotentialOwnerRole;
    }

    public void setHtPotentialOwnerRole(String htPotentialOwnerRole) {
        this.htPotentialOwnerRole = htPotentialOwnerRole;
    }

    public String getHtAdminRole() {
        return htAdminRole;
    }

    public void setHtAdminRole(String htAdminRole) {
        this.htAdminRole = htAdminRole;
    }

    public String getBpsUsername() {
        return bpsUsername;
    }

    public void setBpsUsername(String bpsUsername) {
        this.bpsUsername = bpsUsername;
    }

    public String getBpsUserPassword() {
        return bpsUserPassword;
    }

    public void setBpsUserPassword(String bpsUserPassword) {
        this.bpsUserPassword = bpsUserPassword;
    }
}