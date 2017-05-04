/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jclouds.blobstore.internal;

import org.jclouds.blobstore.BlobStoreContext;
import org.jclouds.blobstore.util.BlobUtils;

import static com.google.common.base.Preconditions.checkNotNull;

abstract class AbstractBlobStore {
    protected final BlobStoreContext context;
    protected final BlobUtils blobUtils;

    protected AbstractBlobStore(BlobStoreContext context, BlobUtils blobUtils) {
        this.context = checkNotNull(context, "context");
        this.blobUtils = checkNotNull(blobUtils, "blobUtils");
    }
}
