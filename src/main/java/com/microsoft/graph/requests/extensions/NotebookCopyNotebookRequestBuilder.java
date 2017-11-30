// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

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

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Notebook Copy Notebook Request Builder.
 */
public class NotebookCopyNotebookRequestBuilder extends BaseNotebookCopyNotebookRequestBuilder implements INotebookCopyNotebookRequestBuilder {

    /**
     * The request builder for this NotebookCopyNotebook
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public NotebookCopyNotebookRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final String groupId, final String renameAs, final String notebookFolder) {
        super(requestUrl, client, requestOptions, groupId, renameAs, notebookFolder);
    }
}