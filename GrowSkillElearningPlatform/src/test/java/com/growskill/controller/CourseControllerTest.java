package com.growskill.controller;

import static org.hamcrest.CoreMatchers.any;
import static org.hamcrest.CoreMatchers.is;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.growskill.model.Course;
import com.growskill.service.CourseService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CourseService courseService;

    @Test
    public void testGetCourseById() throws Exception {
        // Given
        Course mockCourse = new Course();
        mockCourse.setCourseId(1L);
        mockCourse.setTitle("Java Programming");
        mockCourse.setInstructor("John Doe");

        given(courseService.getCourseById(1L)).willReturn(mockCourse);

        // When and Then
        mockMvc.perform(get("/course/1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.courseId", is(1)))
                .andExpect(jsonPath("$.title", is("Java Programming")))
                .andExpect(jsonPath("$.instructor", is("John Doe")));
    }

    @Test
    public void testCreateCourse() throws Exception {
        // Given
        Course mockCourse = new Course();
        mockCourse.setTitle("Python Programming");
        mockCourse.setInstructor("Jane Doe");

        given(courseService.createCourse((Course) any(Course.class))).willReturn(mockCourse);

        // When and Then
        mockMvc.perform(post("/course/create")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(mockCourse)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.title", is("Python Programming")))
                .andExpect(jsonPath("$.instructor", is("Jane Doe")));
    }

    // Additional test cases as needed

    // Helper method to convert object to JSON string
    private static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
