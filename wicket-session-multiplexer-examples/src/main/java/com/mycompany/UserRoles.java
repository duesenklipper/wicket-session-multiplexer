/**
 * Copyright (C) 2017 Carl-Eric Menzel <cmenzel@wicketbuch.de>
 * and possibly other session-multiplexer contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mycompany;

import org.apache.wicket.authroles.authorization.strategies.role.Roles;

public class UserRoles extends Roles {

	private static final long serialVersionUID = -426873801823212949L;

	public static final String SIGNED_USER = "SIGNED_USER";
	
}
