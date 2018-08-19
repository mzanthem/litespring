package org.litespring.beans.factory;

/**
 *  <p>bean definition是一个内部概念</p>
 *  <p>不应该放在BeanFactory中</p>
 *    getBeanDefinition
 *    registerDefinition 
 *  <p>单独抽离出一个接口 -- BeanDefinitionRegister</p>
 * @author mazan
 *
 */
public interface BeanFactory {

	Object getBean(String beanID);

}
