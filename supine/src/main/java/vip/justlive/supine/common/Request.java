/*
 * Copyright (C) 2019 the original author or authors.
 *
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

package vip.justlive.supine.common;

import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * rpc request
 *
 * @author wubo
 */
@Data
@Accessors(chain = true)
public class Request implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * 请求id
   */
  private long id;
  /**
   * 方法id
   */
  private int mid;
  /**
   * 方法调用参数
   */
  private Object[] args;

}
