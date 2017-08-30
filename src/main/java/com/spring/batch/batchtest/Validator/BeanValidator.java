package com.spring.batch.batchtest.Validator;

import org.springframework.batch.item.validator.ValidationException;
import org.springframework.batch.item.validator.Validator;
import org.springframework.beans.factory.InitializingBean;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 * 项目：fs-fubei-shop
 * 包名：com.spring.batch.batchtest.Validator
 * 功能：数据校验
 * 时间：2017/8/22
 * 作者：PGG
 */
public class BeanValidator<T> implements Validator<T>, InitializingBean{
    private javax.validation.Validator validator;
    @Override
    public void validate(T t) throws ValidationException {
// 使用Validator的validate方法校验数据
        Set<ConstraintViolation<T>> constraintViolations = validator.validate(t);
        if (constraintViolations.size() > 0){
            StringBuilder message = new StringBuilder();
            for (ConstraintViolation<T> constraintViolation : constraintViolations) {
                message.append(constraintViolation.getMessage() + "\n");
            }
            throw new ValidationException(message.toString());
        }
    }
    /**
     * 使用 JSR-303 的 Validator来校验我们的数据，在此处进行JSR-303的Validator的初始化
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.usingContext().getValidator();
    }
}
