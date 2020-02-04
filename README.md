# Getting Started

1) This webhook would be invoked if user clicks on the button with following payload.

```json
{"data":{"options":"history"}, "intent": "raise-ticket"}
```

2) You can pass any custom data in the `data` field of the button payload.
3) Client needs to expose a POST webhook. Webhook to receive chat history along with the other fields mentioned in https://docs.triniti.ai/tutorials.html#webhook-request with event as “chat_history”. Refer samplerequest.json file packaged in this sample app for the sample request.
4) Webhook to return response as per https://docs.triniti.ai/tutorials.html#webhook-response
5) For more information refer https://docs.triniti.ai/tutorials.html#manage-fulfillment-via-webhooks


