 /**
 * Copyright 2013 Lunifera GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.lunifera.example.vaadin.osgi.jpacontainer;

import org.lunifera.example.vaadin.osgi.bootstrap.extendable.api.IContentProvider;

import com.vaadin.ui.Component;

public class ContentProvider implements IContentProvider {

	@Override
	public Component getContent() {
		return new AddressBookMainView();
	}

}