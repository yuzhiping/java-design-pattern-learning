/**
 * Copyright (C) 2016-2018 The hexsmith Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
     http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
package com.hexsmith.design.pattern.structural.proxy;

/**
 * @Description 
 * @author hexsmith
 * @date 2018年5月10日 下午3:11:18
 * @version v1.0
 */
public class CommandExecutorProxy implements CommandExecutor {
    
    private static final String USERNAME = "root";
    
    private static final String PASSWORD = "root";
    
    private boolean isAdmin;
    
    private CommandExecutor executor;
    
    public CommandExecutorProxy(String username, String password) {

        if(USERNAME.equalsIgnoreCase(username) && PASSWORD.equals(password)) {
            isAdmin = Boolean.TRUE;
        }
        executor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String cmd) throws Exception {

        if(isAdmin) {
            executor.runCommand(cmd);
        } else {
            if(cmd.trim().startsWith("rm")) {
                throw new Exception("rm command is not allowed for non-admin users.");
            }else {
                executor.runCommand(cmd);
            }
        }
        
    }

}
