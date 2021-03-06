// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsIsErrRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Functions Is Err Request Builder.
 */
public interface IBaseWorkbookFunctionsIsErrRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsIsErrRequest
     *
     * @return the IWorkbookFunctionsIsErrRequest instance
     */
    IWorkbookFunctionsIsErrRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsIsErrRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsIsErrRequest instance
     */
    IWorkbookFunctionsIsErrRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
