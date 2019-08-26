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

package vip.justlive.supine.router;

import vip.justlive.supine.common.Request;
import vip.justlive.supine.transport.ClientTransport;

/**
 * 客户端路由
 *
 * @author wubo
 */
public interface Router {

  /**
   * 选择路由
   *
   * @param request 请求
   * @return 客户端传输
   */
  ClientTransport route(Request request);

}