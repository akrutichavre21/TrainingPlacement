<g:applyLayout name="mainLayoutStudent">
<html>
    <head></head>
    <body>
        <content tag="body">
            <g:if test="${abc}">
                <g:each in="${abc}">
                    <div class="card" style="padding: 10px 10px">
                        <p>Question:</p>
                        <p>${it.question}</p>
                        <p>Answer:</p>
                        <div class="card" style="padding: 10px 10px">${it.answer}</div>
                    </div>
                </g:each>
            </g:if>
            <g:else>
                <h3>No Questions Added.</h3>
            </g:else>
        </content>
    </body>
</html>
</g:applyLayout>