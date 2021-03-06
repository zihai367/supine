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
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 注册信息
 *
 * @author wubo
 */
@Data
@Accessors(chain = true)
public class RegistryInfo implements Serializable {

  /**
   * multicast 默认地址
   */
  public static final String DEFAULT_MULTICAST_ADDRESS = "234.69.69.69:56969";

  private static final long serialVersionUID = 1L;

  /**
   * 远程服务主机
   */
  private String host;
  /**
   * 远程服务端口
   */
  private int port;
  /**
   * 远程服务可调用方法
   */
  private List<RequestKey> keys;
}
