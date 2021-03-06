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
 * The interface for the Base Education Class With Reference Request.
 */
public interface IBaseEducationClassWithReferenceRequest extends IHttpRequest {

    void post(final EducationClass newEducationClass, final IJsonBackedObject payload, final ICallback<EducationClass> callback);

    EducationClass post(final EducationClass newEducationClass, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<EducationClass> callback);

    EducationClass get() throws ClientException;

	void delete(final ICallback<EducationClass> callback);

	void delete() throws ClientException;

	void patch(final EducationClass sourceEducationClass, final ICallback<EducationClass> callback);

	EducationClass patch(final EducationClass sourceEducationClass) throws ClientException;

    IBaseEducationClassWithReferenceRequest select(final String value);

    IBaseEducationClassWithReferenceRequest expand(final String value);

}
