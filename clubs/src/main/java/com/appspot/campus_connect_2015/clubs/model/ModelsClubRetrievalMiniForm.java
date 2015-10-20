/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2015-08-03 17:34:38 UTC)
 * on 2015-10-20 at 19:55:12 UTC 
 * Modify at your own risk.
 */

package com.appspot.campus_connect_2015.clubs.model;

/**
 * JoinRequestMiniForm -- What's shown on the UI for an join request
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the clubs. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ModelsClubRetrievalMiniForm extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("college_id")
  private java.lang.String collegeId;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCollegeId() {
    return collegeId;
  }

  /**
   * @param collegeId collegeId or {@code null} for none
   */
  public ModelsClubRetrievalMiniForm setCollegeId(java.lang.String collegeId) {
    this.collegeId = collegeId;
    return this;
  }

  @Override
  public ModelsClubRetrievalMiniForm set(String fieldName, Object value) {
    return (ModelsClubRetrievalMiniForm) super.set(fieldName, value);
  }

  @Override
  public ModelsClubRetrievalMiniForm clone() {
    return (ModelsClubRetrievalMiniForm) super.clone();
  }

}
