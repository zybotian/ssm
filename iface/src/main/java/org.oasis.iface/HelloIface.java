package org.oasis.iface;

import org.oasis.model.SexEnum;

/**
 * @author tianbo
 * @date 2019-03-06
 */
public interface HelloIface {
    String hello();

    String hello(String name);

    String hello(String name, SexEnum sexEnum);
}
