// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsTbillYieldRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Functions Tbill Yield Request Builder.
 */
public interface IBaseWorkbookFunctionsTbillYieldRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsTbillYieldRequest
     *
     * @return the IWorkbookFunctionsTbillYieldRequest instance
     */
    IWorkbookFunctionsTbillYieldRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsTbillYieldRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsTbillYieldRequest instance
     */
    IWorkbookFunctionsTbillYieldRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
