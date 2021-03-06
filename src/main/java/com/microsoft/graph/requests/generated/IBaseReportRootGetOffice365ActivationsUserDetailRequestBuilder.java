// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365ActivationsUserDetailRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Report Root Get Office365Activations User Detail Request Builder.
 */
public interface IBaseReportRootGetOffice365ActivationsUserDetailRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReportRootGetOffice365ActivationsUserDetailRequest
     *
     * @return the IReportRootGetOffice365ActivationsUserDetailRequest instance
     */
    IReportRootGetOffice365ActivationsUserDetailRequest buildRequest();

    /**
     * Creates the IReportRootGetOffice365ActivationsUserDetailRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetOffice365ActivationsUserDetailRequest instance
     */
    IReportRootGetOffice365ActivationsUserDetailRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
