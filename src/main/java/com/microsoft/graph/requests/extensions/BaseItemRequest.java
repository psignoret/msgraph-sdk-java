// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.BaseItem;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseBaseItemRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Item Request.
 */
public class BaseItemRequest extends BaseBaseItemRequest implements IBaseItemRequest {

    /**
     * The request for the BaseItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseItemRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<? extends BaseItem> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the BaseItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseItemRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseItem.class);
    }
}
