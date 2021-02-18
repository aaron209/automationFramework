package seleniumLibrary;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class TransformerAnalyzer implements IAnnotationTransformer {

	@SuppressWarnings("rawtypes")
	public void transform(ITestAnnotation ann, Class clas, Constructor cons, Method method) {
		ann.setRetryAnalyzer(RetryAnalyzer.class);
	}
}
