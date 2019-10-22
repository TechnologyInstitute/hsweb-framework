package org.hswebframework.web.entity.form;

import lombok.Getter;
import lombok.Setter;
import org.hswebframework.ezorm.rdb.metadata.RDBColumnMetadata;
import org.hswebframework.web.commons.bean.Bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhouhao
 * @since 3.0
 */
@Setter
@Getter
public class DictConfig implements Bean {

    private static final long serialVersionUID = 2115608884837210121L;

    private String type;

    private String toField;

    private Map<String, Object> config=new HashMap<>();

    private RDBColumnMetadata column;

}