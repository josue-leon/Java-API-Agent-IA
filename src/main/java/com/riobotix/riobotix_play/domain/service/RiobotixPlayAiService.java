package com.riobotix.riobotix_play.domain.service;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface RiobotixPlayAiService {

    @UserMessage("""
        Genera un saludo de bienvenida con emojis a la plataforma de video de Gestion de Contenido Educativo RiobotixPlay.
        Usa menos de 120 caracteres y hazlo con el estilo de Riobotix, profesional moderno y minimalista.
        """)
    String generateGreeting();
}

