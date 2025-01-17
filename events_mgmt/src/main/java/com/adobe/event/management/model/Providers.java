/*
 * Copyright 2017 Adobe. All rights reserved.
 * This file is licensed to you under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under
 * the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
 * OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
/*
 *
 *
 *
 *
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.adobe.event.management.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Adobe I/O Events Providers model
 */
public class Providers {

  @JsonProperty("_embedded")
  private ProviderCollection providerCollection = null;

  public ProviderCollection getProviderCollection() {
    return providerCollection;
  }

  public void setProviderCollection(ProviderCollection _embedded) {
    this.providerCollection = _embedded;
  }

  public Providers() {
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Providers providerCollectionHalModel = (Providers) o;
    return Objects.equals(this.providerCollection, providerCollectionHalModel.providerCollection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerCollection);
  }


  @Override
  public String toString() {
    return "Providers{" + providerCollection + '}';
  }
}
