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
public final class ModelsCollegeDbMiniForm extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String abbreviation;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("alumni_sup")
  private java.lang.String alumniSup;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String email;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String phone;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("student_sup")
  private java.lang.String studentSup;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getAbbreviation() {
    return abbreviation;
  }

  /**
   * @param abbreviation abbreviation or {@code null} for none
   */
  public ModelsCollegeDbMiniForm setAbbreviation(java.lang.String abbreviation) {
    this.abbreviation = abbreviation;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getAlumniSup() {
    return alumniSup;
  }

  /**
   * @param alumniSup alumniSup or {@code null} for none
   */
  public ModelsCollegeDbMiniForm setAlumniSup(java.lang.String alumniSup) {
    this.alumniSup = alumniSup;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * @param email email or {@code null} for none
   */
  public ModelsCollegeDbMiniForm setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * @param location location or {@code null} for none
   */
  public ModelsCollegeDbMiniForm setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * @param name name or {@code null} for none
   */
  public ModelsCollegeDbMiniForm setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPhone() {
    return phone;
  }

  /**
   * @param phone phone or {@code null} for none
   */
  public ModelsCollegeDbMiniForm setPhone(java.lang.String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getStudentSup() {
    return studentSup;
  }

  /**
   * @param studentSup studentSup or {@code null} for none
   */
  public ModelsCollegeDbMiniForm setStudentSup(java.lang.String studentSup) {
    this.studentSup = studentSup;
    return this;
  }

  @Override
  public ModelsCollegeDbMiniForm set(String fieldName, Object value) {
    return (ModelsCollegeDbMiniForm) super.set(fieldName, value);
  }

  @Override
  public ModelsCollegeDbMiniForm clone() {
    return (ModelsCollegeDbMiniForm) super.clone();
  }

}
