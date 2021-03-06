// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Education School With Reference Request Builder.
 */
public class BaseEducationSchoolWithReferenceRequestBuilder extends BaseRequestBuilder implements IBaseEducationSchoolWithReferenceRequestBuilder {

    /**
     * The request builder for the EducationSchool
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseEducationSchoolWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IEducationSchoolWithReferenceRequest instance
     */
    public IEducationSchoolWithReferenceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the IEducationSchoolWithReferenceRequest instance
     */
    public IEducationSchoolWithReferenceRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new EducationSchoolWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IEducationSchoolReferenceRequestBuilder reference(){
        return new EducationSchoolReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}
