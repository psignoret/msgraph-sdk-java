// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IPlannerUserRequest;
import com.microsoft.graph.requests.extensions.PlannerUserRequest;
import com.microsoft.graph.models.extensions.PlannerUser;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Planner User Request.
 */
public class BasePlannerUserRequest extends BaseRequest implements IBasePlannerUserRequest {

    /**
     * The request for the PlannerUser
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BasePlannerUserRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<PlannerUser> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the PlannerUser from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<PlannerUser> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PlannerUser from the service
     *
     * @return the PlannerUser from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerUser get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<PlannerUser> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this PlannerUser with a source
     *
     * @param sourcePlannerUser the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PlannerUser sourcePlannerUser, final ICallback<PlannerUser> callback) {
        send(HttpMethod.PATCH, callback, sourcePlannerUser);
    }

    /**
     * Patches this PlannerUser with a source
     *
     * @param sourcePlannerUser the source object with updates
     * @return the updated PlannerUser
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerUser patch(final PlannerUser sourcePlannerUser) throws ClientException {
        return send(HttpMethod.PATCH, sourcePlannerUser);
    }

    /**
     * Creates a PlannerUser with a new object
     *
     * @param newPlannerUser the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PlannerUser newPlannerUser, final ICallback<PlannerUser> callback) {
        send(HttpMethod.POST, callback, newPlannerUser);
    }

    /**
     * Creates a PlannerUser with a new object
     *
     * @param newPlannerUser the new object to create
     * @return the created PlannerUser
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerUser post(final PlannerUser newPlannerUser) throws ClientException {
        return send(HttpMethod.POST, newPlannerUser);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPlannerUserRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (PlannerUserRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPlannerUserRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (PlannerUserRequest)this;
     }

}

