// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsBinom_DistRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Binom_Dist Request Builder.
 */
public class WorkbookFunctionsBinom_DistRequestBuilder extends BaseWorkbookFunctionsBinom_DistRequestBuilder implements IWorkbookFunctionsBinom_DistRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsBinom_Dist
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param numberS the numberS
     * @param trials the trials
     * @param probabilityS the probabilityS
     * @param cumulative the cumulative
     */
    public WorkbookFunctionsBinom_DistRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement numberS, final com.google.gson.JsonElement trials, final com.google.gson.JsonElement probabilityS, final com.google.gson.JsonElement cumulative) {
        super(requestUrl, client, requestOptions, numberS, trials, probabilityS, cumulative);
    }
}
