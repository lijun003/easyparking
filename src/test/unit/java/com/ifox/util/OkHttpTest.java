package com.ifox.util;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.junit.Before;
import org.junit.Test;
import com.alibaba.fastjson.JSON;
import com.ifox.domain.Question;

import okhttp3.Response;

public class OkHttpTest {
    private static final String URL = "http://localhost:8086/qas-service/questions/?keyword=str";
    private static final String URL_POST = "http://localhost:8086/qas-service/questions";
    private List<Question> questions = new ArrayList<>();

    @Before
    public void setUp() {


    }

    @Test
    public void okHttpGetTest() throws IOException {
        Response response = HttpUtil.get(URL);
        assertThat(response.code(), is(200));
       questions = JsonUtil.getBeans(response.body().string(), Question.class);
        assertThat(questions.get(0).getBookId(), is("string"));
    }

    @Test
    public void oKHttpPostTest() throws IOException {
        Question expectedQue = new Question (UUID.randomUUID().toString(), "string", "string");
        Response response = HttpUtil.post(URL_POST, JSON.toJSONString(expectedQue));
        assertThat(response.code(), is(201));
        assertThat(JsonUtil.getBean(response.body().string(), Question.class).getContent(), is("string"));
    }
}
