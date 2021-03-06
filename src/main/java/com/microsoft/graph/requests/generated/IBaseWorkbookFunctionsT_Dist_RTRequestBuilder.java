// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsT_Dist_RTRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Functions T_Dist_RTRequest Builder.
 */
public interface IBaseWorkbookFunctionsT_Dist_RTRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsT_Dist_RTRequest
     *
     * @return the IWorkbookFunctionsT_Dist_RTRequest instance
     */
    IWorkbookFunctionsT_Dist_RTRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsT_Dist_RTRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsT_Dist_RTRequest instance
     */
    IWorkbookFunctionsT_Dist_RTRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
