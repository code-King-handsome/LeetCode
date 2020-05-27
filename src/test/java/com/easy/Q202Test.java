package com.easy;

import org.junit.Test;

public class Q202Test {

  private static final String PK = "tenant";
  private static final String RK = "throttling_type";
  private static final String VERSION = "version";

  //UpdateItemRequest components
  private static final String UPDATE = ":update";
  private static final String NOT_THROTTLED = ":notThrottled";
  private static final String TENANT_NAME = ":tenantName";
  private static final String THROTTLING_TYPE = ":type";
  private static final String UPDATE_EXPRESSION = "ADD " + VERSION + " " + UPDATE;
  private static final String SET_EXPRESSION = "SET " + VERSION + " = " + UPDATE;
  private static final String CONDITION_EXPRESSION =
      "(attribute_not_exists("
          + PK
          + ") AND attribute_not_exists("
          + RK
          + ")) OR ("
          + PK
          + " = "
          + TENANT_NAME
          + " AND "
          + RK
          + " = "
          + THROTTLING_TYPE
          + " AND "
          + VERSION
          + " <= "
          + NOT_THROTTLED
          + ")";

  private static final String CONDITIONAL_WRITE =
      PK + " = " + TENANT_NAME + " AND " + RK + " = " + THROTTLING_TYPE;

  @Test
  public void test1(){
    System.out.println(CONDITION_EXPRESSION);
    System.out.println(CONDITIONAL_WRITE);
  }
}
