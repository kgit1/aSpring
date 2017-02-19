package a1.Start;

import java.lang.reflect.Field;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

//implement BeanPostProcessor to show spring where is it
public class StringChanger implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String name) throws BeansException {
		// use reflection to assign all fields of given object to array of
		// fields
		Field[] fields = bean.getClass().getDeclaredFields();

		// iterate through array of fields
		try {
			for (int i = 0; i < fields.length; i++) {
				// if field returns String
				if (fields[i].getType().equals(java.lang.String.class)) {
					// make field accessible in case it private or protected by
					// another modifier
					fields[i].setAccessible(true);

					String original =
							// Returns the value of the field represented by
							// this Field, on the specified object
							(String) fields[i].get(bean);

					// Sets the field represented by this Field object on the
					// specified object argument to the specified new value
					fields[i].set(bean, changer(original));
				}
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String name) throws BeansException {
		return bean;
	}

	private String changer(String original) {
		if (original == null) {
			return original;
		}
		return original.replaceAll("o|s", "K").replaceAll("O|S", "k");
	}
}
